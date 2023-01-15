----Steps to be followed before running the Quiz program---


1. Schema to be created as <miniproject_group_h> 
  or else in class: ConnectionMiniProject.java line number 21 you can put your existinng schema name. 
2. After establishing the connection you have to fire Create table query as follows:

         
         CREATE TABLE question(
         question_id int(10) not null auto_increment primary key,
         question varchar(255) default null,
         option_A varchar(255) default null,
         option_B varchar(255) default null,
         option_C varchar(255) default null,
         option_D varchar(255) default null,
         correct_Answer varchar(255) default null);

This is how the table will look like:

question_id		question	option_A	option_B	option_C	option_D	correct_Answer
 1.
 2.
 3.

3. Another table need to be created for Student details such as student_id , student_name & marks
   Query to be fired for creating the student table as follows:

         CREATE TABLE Student(
         student_id int(10) not null auto_increment primary key,
         student_name varchar(255) default null,
         student_marks int (10) default null);

4. After executing the program once, comment line number 15 and 16 under class: MainTest.java to avoid multiple entries into the database.

Output on console will look like:

********Welcome to the JAVA Quiz*********

1. Start quiz
2. Get Student records
3. Get Student marks
4. Exit

Select one of the above options
