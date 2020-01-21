import { Component, OnInit } from '@angular/core';
import  {FormGroup,FormControl } from '@angular/forms'
import { LeadService } from './lead.service';
 

@Component({
  selector: 'app-lead',
  templateUrl: './lead.component.html',
  styleUrls: ['./lead.component.scss']
})
export class LeadComponent implements OnInit {

  leaddata:String[];
  constructor(private leadservice:LeadService) { }

  ngOnInit() {
    this.leadservice.ldata().subscribe(
     response =>this.handleSuccessfulResponse(response),
    );
  }
  handleSuccessfulResponse(response)
  {
     this.leaddata=(response);
  }
}
