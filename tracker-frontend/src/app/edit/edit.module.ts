import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DayEditComponent } from './day-edit/day-edit.component';
import { WeekEditComponent } from './week-edit/week-edit.component';
import { MonthEditComponent } from './month-edit/month-edit.component';



@NgModule({
  declarations: [
    DayEditComponent,
    WeekEditComponent,
    MonthEditComponent
  ],
  imports: [
    CommonModule
  ]
})
export class EditModule { }
