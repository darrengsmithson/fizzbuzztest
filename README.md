# fizzbuzztest
After the files have been downloaded, run `mvn test` to run the tests and then `mvn install` to create a jar in the target directory.

When the jar has been created `fizzbuzz-0.0.1-SNAPSHOT.jar` use the command line to execute the program with the required parameters.

For e.g `java -jar fizzbuzz-0.0.1-SNAPSHOT.jar 3 5 100` will create printout of 100 numbers with 3 being replaced by fizz, 5 replaced by buzz and 3+5 combo replaced by fizzbuzz.

The code has been written so that any number can replace 3 or 5 and any number of lines can be given. If 3 parameters arent used the run is invalidated and the program ends without error.
