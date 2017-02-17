// Lab2.cpp
// Lab2

#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int main() {
    int numOfValues;
    std::cout << "Enter amount of values \n";
    
    cin >> numOfValues;
    vector <float> values(numOfValues);
    float value; 
    float sum=0;
    for (int i = 0; i<numOfValues; i++){
          cout<<"Enter value number " << i+1 << "\n";
          cin>>value;
          values.push_back(1); 
          values[i] =value;  
          cout<<"values vector at index "<< i <<" = "<<values[i]<<"\n";
          sum += values[i];
    } 
    
    cout<< "the sum is " << sum <<"\n";
    float average = sum / numOfValues; 
    float summation=0;
    float squard;
        for (int j = 0; j<numOfValues; j++){ 
          squard = values[j]-average;
          squard = pow(squard, 2);
          summation += squard;  
    } 
    float standard = sqrt(summation / (numOfValues));
    cout<< "Standard Dievation = " << standard <<"\n"; 
  }