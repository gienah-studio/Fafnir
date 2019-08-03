//
//  main.cpp
//  leetcode-122
//
//  Created by Aiewing on 2019/7/24.
//  Copyright © 2019 Aiewing. All rights reserved.
//

#include <iostream>
#include <vector>

using namespace std;

/*
 BF大法
 时间复杂度：O(N)
 空间复杂度：O(N)
 */
class Solution1 {
public:
    int maxProfit(vector<int>& prices) {
        if (prices.size() < 2) {
            return 0;
        }
        vector<int> differences;
        for (int i = 1; i < prices.size(); ++i) {
            differences.push_back(prices[i] - prices[i - 1]);
        }
        int sum = 0;
        for (int i = 0; i < differences.size(); ++i) {
            if (differences[i] > 0) {
                sum += aie[i];
            }
        }
        return sum;
    }
};

/*
 贪心算法
 时间复杂度：O(N)
 空间复杂度：O(1)
 */
class Solution2 {
public:
    int maxProfit(vector<int>& prices) {
        if (prices.size() < 2) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < prices.size(); ++i) {
            int temp = prices[i] - prices[i - 1];
            if ( temp > 0) {
                sum += temp;
            }
        }
        return sum;
    }
};


int main(int argc, const char * argv[]) {
    
    std::cout << "Hello, World!\n";
    return 0;
}
