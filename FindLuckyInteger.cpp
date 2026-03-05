#include <iostream>
#include <sstream>
#include <unordered_map>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int findLucky(vector<int>& arr) {
        unordered_map<int, int> freq;
        int maxLucky = -1;

        for(int num : arr){
            freq[num]++;
        }

        for(auto& pair : freq){
            if(pair.first == pair.second){
                maxLucky = max(maxLucky, pair.first);
            }
        }
        return maxLucky;
    }
};

int main(){
    string input;
    getline(cin, input);

    vector<int> nums;
    stringstream ss(input);
    string temp;

    while(getline(ss, temp, ',')){
        nums.push_back(stoi(temp));
    }

    Solution ob;
    int result = ob.findLucky(nums);
    cout << result << endl;

    return 0;
}