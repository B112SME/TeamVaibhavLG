import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { CibilComponent } from './cibil/cibil.component';
import { LeadComponent } from './lead/lead.component';
import {FormsModule} from '@angular/forms';

const oerouting:Routes=[
  { path:'dashboard',component:DashboardComponent},
  { path:'cibil',component:CibilComponent},
  { path:'lead',component:LeadComponent}
]
@NgModule({
  declarations: [DashboardComponent, CibilComponent, LeadComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(oerouting),
    FormsModule
  ]
})
export class OEModule { }
