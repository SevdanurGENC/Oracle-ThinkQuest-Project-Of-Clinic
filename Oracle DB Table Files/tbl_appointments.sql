CREATE TABLE  "TBL_APPOINTMENTS" 
   (	"ROW_ID" NUMBER, 
	"PATIENT_NAME" NVARCHAR2(100), 
	"PATIENT_SURNAME" NVARCHAR2(100), 
	"DOCTOR_NAME" NVARCHAR2(100), 
	"DOCTOR_SURNAME" NVARCHAR2(100), 
	"APPOINTMENT_TIME" NVARCHAR2(100), 
	"APPOINTMENT_DATE" NVARCHAR2(100), 
	"BRANCH" NVARCHAR2(100), 
	 CONSTRAINT "TBL_APPOINTMENTS_PK" PRIMARY KEY ("ROW_ID") ENABLE
   )