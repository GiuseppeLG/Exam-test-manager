# Exam-test-manager
A Java simulator of test manager with hibernate data persistence and JUnit and Mockito testing.

The teacher records the data relating to the test: name of the course, the date of the test, the duration (expressed in minutes) and the set of tests to be submitted to the students.

The student must register, indicating: his or her name, surname and matriculation number. The system provides the student with the text of an individual test (choosing it from the set of tests registered by the teacher) and calculates the time limit within which the solution must be delivered based on the time of assignment of the test.

The system will have to record all these data in a special archive.
The student must complete his / her work and deliver it via the system by the student. The system also sends an e-mail confirming receipt or delivery impossible if the time limit has expired.

The teacher corrects every task, inserting a grade between 18 and 30 or Insufficient.
At the end of the insertion of the judgments of all the tasks, an e-mail message is delivered to each student with the grade assigned to the test.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
This software is free.
[GPL](http://www.gnu.org/licenses/gpl.html)
