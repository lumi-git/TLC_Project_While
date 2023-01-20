```mermaid
classDiagram 
class ID0_START_0{
   Name : globalProgram
   -------------------------
   | name | kind | type |
   --------------------------
   ->   not , tree , func , 1 , UniqueID: 0

   ->   stdlibtestADD , tree , func , 2 , UniqueID: 3

   ->   main , tree , func , 4 , UniqueID: 7

}

class ID1_FUNC_0{
   Name : not
   -------------------------
   | name | kind | type |
   --------------------------
   ->   Arg1 , tree , var , 0 , UniqueID: 1

   ->   Result , tree , var , 0 , UniqueID: 2

}

class ID2_FUNC_1{
   Name : stdlibtestADD
   -------------------------
   | name | kind | type |
   --------------------------
   ->   Arg1 , tree , var , 0 , UniqueID: 4

   ->   Arg2 , tree , var , 0 , UniqueID: 5

   ->   Result , tree , var , 0 , UniqueID: 6

}

class ID3_FUNC_2{
   Name : main
   -------------------------
   | name | kind | type |
   --------------------------
   ->   A , tree , var , 0 , UniqueID: 8

   ->   B , tree , var , 0 , UniqueID: 9

   ->   C , tree , var , 0 , UniqueID: 10

   ->   D , tree , var , 0 , UniqueID: 11

   ->   Liste , tree , var , 0 , UniqueID: 12

}

ID0_START_0 --|> ID1_FUNC_0

ID0_START_0 --|> ID2_FUNC_1

ID0_START_0 --|> ID3_FUNC_2

```
