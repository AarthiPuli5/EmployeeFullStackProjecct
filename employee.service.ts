import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Employee {
  id: number;
  name: string;
  department: string;
}

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  [x: string]: any;

  private apiUrl = 'http://localhost:8080/api/v1/employees';

  constructor(private httpClient : HttpClient) { }

  getEmployeesList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.apiUrl}`);
  }

  createEmployee(employee: Employee): Observable<Object>{
    return this.httpClient.post(`${this.apiUrl}`,employee);
  }

  getEmployeeById(id: number): Observable<Employee>{
  return this.httpClient.get<Employee>(`${this.apiUrl}/${id}`);
  }

  updateEmployee(id: number, employee: Employee): Observable<Object>{
    return this.httpClient.put(`${this.apiUrl}/${id}`,employee);
  }

  deleteEmployee(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.apiUrl}/${id}`);
  }
}

