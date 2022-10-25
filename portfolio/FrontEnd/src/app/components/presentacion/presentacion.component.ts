import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/Model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-presentacion',
  templateUrl: './presentacion.component.html',
  styleUrls: ['./presentacion.component.css']
})
export class PresentacionComponent implements OnInit {
persona: persona = new persona ("","","")

  constructor(public personaService: PersonaService) { }
 
  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data =>{this.persona = data});}
 
  




}


