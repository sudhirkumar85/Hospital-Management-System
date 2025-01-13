#Create Database
create database HospitalManagementStstem;

#use Database
use HospitalManagementStstem;

#Create Table Login
create table Employee( 
ID int auto_increment primary key ,
name varchar(25) not null,
email varchar(36) unique not null,
password varchar(10) not null,
designation varchar(45) not null,
aadhar varchar(15) unique not null
);

#create table patient
create table patient (
id int auto_increment primary key,
name varchar(30) not null,
p_id varchar(25),
id_number varchar(15) unique,
mobile varchar(15),
email varchar(25),
address varchar(255),
appointment_date date
);

