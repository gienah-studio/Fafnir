//
//  main.cpp
//  LeetCode-155
//
//  Created by Aiewing on 2019/8/3.
//  Copyright © 2019 Aiewing. All rights reserved.
//

#include <iostream>
#include <vector>
#include <assert.h>

using namespace std;
/*
 C++STD容器的方法
 计算最小值时间复杂度：O(N)
 计算最小值空间复杂度：O(1)
 */
class MinStack1 {
public:
    vector<int> CStack;
    MinStack1() {
        
    }
    
    void push(int x) {
        CStack.push_back(x);
    }
    
    void pop() {
        CStack.pop_back();
    }
    
    int top() {
        return CStack.back();
    }
    
    int getMin() {
        int minNum = INT_MAX;
        for (int i = 0; i < CStack.size(); ++i) {
            minNum = min(minNum, CStack[i]);
        }
        return minNum;
    }
};


/*
 C语言数组的方法
 计算最小值时间复杂度：O(N)
 计算最小值空间复杂度：O(1)
 */
class MinStack2 {
public:
    int *m_data;
    // 当前有效的数据数量
    int m_size;
    // 总的数组可以容纳的数量
    int m_count;
    MinStack2() {
        m_size = 0;
        m_count = 4;
        m_data = new int[m_count];
    }
    
    void push(int x) {
        // 重新申请资源
        if (m_size >= m_count) {
            int *temp = new int[m_count * 2];
            memcpy(temp, m_data, sizeof(int) * m_size);
            delete []m_data;
            m_data = temp;
            m_count *= 2;
        }
        m_data[m_size++] = x;
    }
    
    void pop() {
        if (m_size >0) {
            --m_size;
        }
    }
    
    int top() {
        if (m_size > 0) {
            return m_data[m_size - 1];
        }
        return 0;
    }
    
    int getMin() {
        int minNum = INT_MAX;
        for (int i = 0; i < m_size; ++i) {
            minNum = min(minNum, m_data[i]);
        }
        return minNum;
    }
};


/*
 C语言数组的方法 计算最小值以空间换时间
 计算最小值时间复杂度：O(1)
 计算最小值空间复杂度：O(N)
 */
class MinStack {
public:
    int *m_data;
    // 当前有效的数据数量
    int m_size;
    // 总的数组可以容纳的数量
    int m_count;
    
    // 存储最小值
    int *m_minData;
    int m_minSize;
    int m_minCount;
    
    MinStack() {
        m_size = 0;
        m_count = 4;
        m_data = new int[m_count];
        
        m_minSize = 0;
        m_minCount = 4;
        m_minData = new int[m_minCount];
    }
    
    void push(int x) {
        // 重新申请资源
        if (m_size >= m_count) {
            int *temp = new int[m_count * 2];
            memcpy(temp, m_data, sizeof(int) * m_size);
            delete []m_data;
            m_data = temp;
            m_count *= 2;
        }
        if (m_size > 0) {
            // 先比较大小 如果是小于等于的就存
            if (x <= m_minData[m_minSize - 1]) {
                // 重新申请资源
                if (m_minSize >= m_minCount) {
                    int *minTemp = new int[m_minCount * 2];
                    memcpy(minTemp, m_minData, sizeof(int) * m_minSize);
                    delete []m_minData;
                    m_minData = minTemp;
                    m_minCount *= 2;
                }
                m_minData[m_minSize++] = x;
            }
        } else {
            m_minData[m_minSize++] = x;
        }
        m_data[m_size++] = x;
    }
    
    void pop() {
        if (m_size >0) {
            if (m_data[m_size - 1] == m_minData[m_minSize - 1]) {
                --m_minSize;
            }
            --m_size;
        }
    }
    
    int top() {
        if (m_size > 0) {
            return m_data[m_size - 1];
        }
        return 0;
    }
    
    int getMin() {
        if (m_minSize > 0) {
            return m_minData[m_minSize - 1];
        };
        return 0;
    }
};

int main(int argc, const char * argv[]) {
    // insert code here...
    std::cout << "Hello, World!\n";
    return 0;
}
