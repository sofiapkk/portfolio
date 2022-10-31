import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JwtDto } from '../Model/jwt-dto';
import { NuevoUsuario } from '../Model/nuevo-usuario';
import { LoginUsuario } from '../Model/login-usuario';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  authURL = 'https://localhost:8080/auth/';

  constructor(private httpClient: HttpClient) { }

  public nuevo(nuevoUsuario: NuevoUsuario): Observable<any>{
    return this.httpClient.post<any>(this.authURL + 'nuevo', nuevoUsuario);
}
public login(loginUsuario: LoginUsuario): Observable<JwtDto>{
return this.httpClient.post<JwtDto>(this.authURL + 'login', loginUsuario);
}
}
