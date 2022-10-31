import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../Model/persona.model';

interface PersonaServiceInterface {
  getPersona(): void;
  }

  @Injectable({
    providedIn: 'root'
  })
  
export class PersonaService implements PersonaServiceInterface {
URL = 'http://localhost:8080/personas/';

  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona> {
 return this.http.get<persona>(this.URL+'traer/perfil');

    
  }
}

