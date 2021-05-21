import {Component} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  //private OPEN: string = "expand navbar-expand";
  //private CLOSED: string = "collapse navbar-collapse";
  private OPEN: string = "open";
  private CLOSED: string = "closed";
  public sideMenuClass: string = this.CLOSED;

  public toggleMenu(): void {
      this.sideMenuClass = this.CLOSED == this.sideMenuClass ? this.OPEN : this.CLOSED;
  }

}
