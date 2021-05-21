import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {DayEditComponent} from "./edit/day-edit/day-edit.component";
import {WeekEditComponent} from "./edit/week-edit/week-edit.component";
import {MonthEditComponent} from "./edit/month-edit/month-edit.component";

const routes: Routes = [{ path:  'day', component:  DayEditComponent},
  {path:"week", component: WeekEditComponent},
  {path:"month", component: MonthEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
