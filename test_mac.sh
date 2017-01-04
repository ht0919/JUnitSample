javac Sample.java
javac -cp junit-4.12.jar:. SampleTest.java
java -cp junit-4.12.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore SampleTest
