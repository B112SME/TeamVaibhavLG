import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


export class Ilead{
  constructor(
    public leadId:string,
    public enquiryId:string,
    public customerAdharcard:string,
    public customerPancard:string,
    public customerAdharno:string,
    public customerPanno:string,
    public date:string,
    public statusCode:string,
    public leadDateAndTime:string,
  ) {}
}


@Injectable({
  providedIn: 'root'
})
export class LeadService {

  constructor(private http:HttpClient) { }
ldata(){
  return this.http.get<Ilead[]>('http://localhost:3000/getdata');
}

}
