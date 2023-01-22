# TLC Project While

This project is a While to Java compiler.

## Description

We are four students creating a compiler for the while language.
you can find the documentation of the language [here](Specifications_while.pdf)

## Getting Started

### Dependencies

All dependencies are managed via a Maven project.

### Installing
To get started use the following command:
```
git clone https://github.com/lumi-git/TLC_Project_While.git
```

### Executing program

To write a while programm, you need to create a name.while file in example and write your programm following the while rules. 
You need to change String fileName in the App class (TLC_Project_While/src/main/java/TLC/CompilerWhile/App.java) and put your file name to run the correct programm.

To build your while programm, there is two step.

1) You will need to execute the App.java class . This will generate a main.java containing your programm. you will 
find it in the JAVAOUT folder .

2) Then you will need to run this main.java . The while output will print in the console. 




## Authors

* Ronan Tremoureux
* Melvin Mathurin
* Enzo Voisin
* Yann Paillard
