int sum(int num1, int num2) {
   int num3;
   num3 = num1 + num2;
   return (num3);
}

int sub(int num1, int num2) {
   int num3;
   num3 = num1 - num2;
   return (num3);
}

int mul(int num1, int num2) {
   int num3;
   num3 = num1 * num2;
   return (num3);
}



int main() {
   int num1, num2, res;
 
   printf("\nEnter the two numbers : ");
   scanf("%d %d", &num1, &num2);
 
   //Call Function Sum With Two Parameters
   res = sum(num1, num2);
   res1 = sub(num1,num2);
   res2=div(num1,num2);
   
 
   printf("nAddition of two number is : ",res);
   printf("nsubtraction of two number is : ",res1);
   printf("ndivision of two number is : ",res2);
   return (0);
}

int div(int num1, int num2) {
   int num3;
   num3 = num1 / num2;
   return (num3);
}


