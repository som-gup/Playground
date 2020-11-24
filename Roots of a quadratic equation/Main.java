#include <iostream>
#include <cmath>
#include<stdio.h>
using namespace std;

int main() {

    float a, b, c, x1, x2, discriminant, realPart, imaginaryPart;
    cin >> a >> b >> c;
    discriminant = b*b - 4*a*c;
    
    if (discriminant > 0) {
        x1 = (-b + sqrt(discriminant)) / (2*a);
        x2 = (-b - sqrt(discriminant)) / (2*a);
        printf("root1 = %.2f  ",x1);
        printf("root2 = %.2f",x2);
    }
    
    else if (discriminant == 0) {
        x1 = (-b + sqrt(discriminant)) / (2*a);
        printf("root1 = %.2f  ",x1);
        printf("root2 = %.2f ",x1);
    }

    else {
        realPart = -b/(2*a);
        imaginaryPart =sqrt(-discriminant)/(2*a); 
        printf("root1 = %.2f + %.2fi  ",realPart,imaginaryPart);
        printf("root2 = %.2f - %.2fi",realPart,imaginaryPart);
    }

    return 0;
}