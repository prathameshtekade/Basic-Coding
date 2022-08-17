import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'for Loop';
userdetails=[
  {name:'Prathamesh',email:'pattya@gmail.com',phone:'7378999166',SocialAccounts:['facebook','insta','linkedln']} ,
  {name:'tekade',email:'tekade@gmail.com',phone:'7378999165',SocialAccounts:['facebook','insta','linkedln']},
  {name:'pratik',email:'pratik@gmail.com',phone:'7378999167',SocialAccounts:['facebook','insta','linkedln']},
  {name:'krushna',email:'pattya@gmail.com',phone:'7378999168',SocialAccounts:['facebook','insta','linkedln']}
];
}
