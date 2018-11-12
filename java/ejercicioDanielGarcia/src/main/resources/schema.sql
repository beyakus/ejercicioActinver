create table student
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

create table login_user
(
	id integer not null, 
	name varchar(255) not null,
	user varchar(222) not null,
	password varchar(255) not null,
	primary key(id)
);
