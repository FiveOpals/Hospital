import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Patient } from './Patient';


@Injectable({
  providedIn: 'root'
})
export class PatientService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json'
    })
  };

  patientUrl = window.location.href + 'patient';

  //patientUrl = './assets/patient.json';
  constructor(private http: HttpClient) { }
  getPatientList(): Observable<Patient[]> {
    console.log(this.patientUrl);
    return this.http.get<Patient[]>(this.patientUrl)
      .pipe(
        retry(3), // retry a failed request up to 3 times
        catchError(this.handleError) // then handle the error
      );
  }
  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  }

  addPatient (patient: Patient): Observable<Patient> {

    return this.http.post<Patient>(this.patientUrl, patient, this.httpOptions)
      .pipe(
        retry(3),
        catchError(this.handleError)
      );
  }

  updatePatient (patient: Patient): Observable<Patient> {

    return this.http.put<Patient>(this.patientUrl + '/' + patient.id, patient, this.httpOptions)
      .pipe(
        retry(3),
        catchError(this.handleError)
      );
  }

  deletePatient (patient: Patient): Observable<Patient> {

    return this.http.post<Patient>(this.patientUrl, patient, this.httpOptions)
      .pipe(
        retry(3),
        catchError(this.handleError)
      );
  }

}

