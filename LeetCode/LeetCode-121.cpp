//
//  main.cpp
//  LeetCode-121
//
//  Created by Aiewing on 2019/7/24.
//  Copyright © 2019 Aiewing. All rights reserved.
//

#include <iostream>
#include <vector>

using namespace std;

/*
 BF大法
 时间复杂度：O(n^2)
 空间复杂度：O(1)
 */
class Solution1 {
public:
    int maxProfit(vector<int>& prices) {
        int res = 0;
        for (auto i = 0; i < prices.size(); i++) {
            int buy = prices[i];
            for (auto j = i + 1; j < prices.size(); j++) {
                int sale = prices[j];
                if (sale - buy > res) {
                    res = sale - buy;
                }
            }
        }
        return res;
    }
};

/*
 遍历比较大法 保存一片区域内的最小值 和可以产生收益的最大最小值
 时间复杂度：O(n)
 空间复杂度：O(1)
 */
class Solution2 {
public:
    int maxProfit(vector<int>& prices) {
        if (prices.size() > 1) {
            int min = prices[0];
            int max = min;
            int minmin = min;
            for (auto i = 1; i < prices.size(); i++) {
                if (prices[i] < minmin) {
                    // 存起来
                    minmin = prices[i];
                } else if (prices[i] - minmin >= max - min) {
                    min = minmin;
                    max = prices[i];
                } else if (prices[i] > max) {
                    max = prices[i];
                }
            }
            return max - min;
        }
        return 0;
    }
};

/*
 DP大法 dp[i]表示当前的最大收益 min[i]表示当前最小的
        dp[i + 1] = max(dp[i], prices[i + 1] - min[i])
 时间复杂度：O(n)
 空间复杂度：O(1)
 */
class Solution3 {
public:
    int maxProfit(vector<int>& prices) {
        if (prices.size() > 1) {
            int dp = 0;
            int minmin = prices[0];
            for (auto i = 1; i < prices.size(); i++) {
                dp = max(dp, prices[i] - minmin);
                minmin = min(prices[i], minmin);
            }
            return dp;
        }
        return 0;
    }
};

int main(int argc, const char * argv[]) {
    Solution2 *aaa = new Solution2();
    vector<int> aa = {7, 1, 5, 3, 6, 4};
    int res = aaa->maxProfit(aa);
    std::cout << "Hello, World!\n";
    return 0;
}
