/*
 Map大法
 */
class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        if (nums1.size() == 0 || nums2.size() == 0) {
            return {};
        }
        map<int, int> numsMap;
        vector<int> res;
        for (auto i = 0; i < nums1.size(); i++) {
            int subNum = nums1[i];
            if (numsMap[subNum] > 0) {
                // 直接存
                numsMap[subNum]++;
            } else {
                numsMap[subNum] = 1;
            }
        }
        for (auto j = 0; j < nums2.size(); j++) {
            int subNum = nums2[j];
            if (numsMap[subNum] > 0) {
                res.push_back(subNum);
                numsMap[subNum]--;
            }
        }
        return res;
    }
};
