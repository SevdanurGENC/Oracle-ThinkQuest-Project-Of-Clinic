CREATE TABLE  "TBL_DOCTORS" 
   (	"ID" NUMBER, 
	"DR_NAME" NVARCHAR2(100), 
	"DR_SURNAME" NVARCHAR2(100), 
	"CERTIFICATE_NO" NVARCHAR2(100), 
	"BRANCH" NVARCHAR2(100), 
	"ADDRESS" NVARCHAR2(100), 
	"TOWN" NVARCHAR2(100), 
	"PLACE_OF_BIRTH" NVARCHAR2(100), 
	"DATE_OF_BIRTH" NVARCHAR2(100), 
	"TELEPHONE" NVARCHAR2(100), 
	 CONSTRAINT "TBL_DOCTORS_PK" PRIMARY KEY ("ID") ENABLE
   )   