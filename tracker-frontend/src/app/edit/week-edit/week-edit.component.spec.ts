import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WeekEditComponent } from './week-edit.component';

describe('WeekEditComponent', () => {
  let component: WeekEditComponent;
  let fixture: ComponentFixture<WeekEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WeekEditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WeekEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
