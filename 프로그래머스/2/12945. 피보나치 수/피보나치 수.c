#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int fib(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    return fib(n - 1) + fib(n - 2);
}

int solution(int n) {
    
    int mod = 1234567;
    int a = 0, b = 1, temp;
    
    for (int i = 2; i <= n; i++){
        temp = (a + b) % mod;
        
        a = b;
        b = temp;
    }
    
    return b;
}

int main(){
    int n;
    
    scanf("%d", &n);
    
    printf("%d", solution(n));
    
    return 0;
}