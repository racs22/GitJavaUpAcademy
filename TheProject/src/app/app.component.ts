import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import{FormGroup, FormControl} from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'TheProject';

  productForm = new FormGroup({
    iva: new FormControl(''),
    pvp: new FormControl(''),
    discount: new FormControl(''),
  });

  productValue = "";

  products: any [] = [];
  constructor(
    private http: HttpClient
  ) {}

  setProductValue(product:any){
    console.log(this.productForm)
    this.productValue = JSON.stringify(product)
    // vai buscar ao productform e ao productvalue
  }

 createProduct(){
   this.http.post("http://localhost:8080/stockJE/api/products", this.productForm.value ).subscribe(product => this.setProductValue(product))
 }

getAllProducts() {
  this.http.get("http://localhost:8080/stockJE/api/products").subscribe(
    (res:any) => this.products = res
 )
}



 }





