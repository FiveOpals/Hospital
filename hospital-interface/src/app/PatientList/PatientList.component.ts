import { Component, OnInit } from '@angular/core';
import { Patient } from './Patient';
import { PatientService } from './Patient.service';
@Component({
  selector: 'app-patient-list',
  templateUrl: './PatientList.component.html',
  styleUrls: ['./PatientList.component.sass']
})
export class PatientListComponent implements OnInit {

  public pList: Patient[];
  public checked: Patient[];
  public error: any;
  public model: Patient;


  // etat de formulaire
  public onSelect = false;
  public onAdd = false;
  public onDelete = false;
  public onUpdate = false;
  public submitted = false;
  public patientService: PatientService;



  // Constructeur
  constructor(patientService: PatientService) {
    this.patientService = patientService;
    this.refreshList();

  }

  refreshList() {
    this.patientService.getPatientList().subscribe(pList => (this.pList = pList), error => this.error = error);
    this.onSelect = false;
    this.checked = undefined;

  }


  ngOnInit() {

  }

  selected(): Patient[] {
    if (this.checked === undefined) {
      return Array(0);
    }
    return this.checked.filter(function(value) { return value !== undefined; });
  }



  check(id: string, index?: number) {

    const checkItem = <HTMLInputElement> document.getElementById(id);
    checkItem.checked = !(checkItem.checked);

    this.checking(index);

  }

  checking(index) {

    if (this.checked === undefined) {
      this.checked = new Array(this.pList.length);
    }
    this.onSelect = true;

    if (!this.checked.includes(this.pList[index])) {
      this.checked[index] = this.pList[index];
    } else {
      this.checked[index] = undefined;
    }

    if (this.selected().length === 0) {
      this.onSelect = false;
    }
  }


  // Modification d'etat de composant
  adding() {
    if (!(this.onSelect)) {
      this.onAdd = true;
    }
    this.model = new Patient(null, '', '', '', '', '');
  }

  deleting() {
    if (this.selected().length >= 0) {
      this.onDelete = true;
    }
  }

  updating() {
    if (this.selected().length === 1) {
      this.onUpdate = true;
    }
    this.model = this.clone(this.selected()[0]);
  }

  // operations


  close() {
    this.onAdd = this.onDelete = this.onUpdate = false;
  }

  submite() {
    close();
  }

  submit() {
    // this.submitted = true;
    // console.log(this.model);
    if (this.onDelete) {
      // this.doDelete();
    }
    if (this.onAdd) {
      // this.doAdd();
      this.patientService.addPatient(this.model).subscribe(
        model => {    this.refreshList();
          console.log(model);  }
      );
    }
    if (this.onUpdate) {
      // this.doUpdate();
      this.patientService.updatePatient(this.model).subscribe(
        model => {    this.refreshList();
          console.log(model); }
      );
    }
    this.close();

  }

  clone(e: Patient) {
    return new Patient(e.id, e.firstName, e.lastName, e.address, e.phone, e.birthDate);
  }

}






