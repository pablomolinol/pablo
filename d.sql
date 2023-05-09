CREATE schema  lojainformaticadanilo; 

use lojainformaticadanilo;
CREATE TABLE computadordanilo(
numeroDoComputador int primary key auto_increment,
marca varchar(20) NOT NULL,
Processador varchar(20) NOT NULL,
hd varchar(20) NOT NULL
);

select * from computadordanilo;
