# Algorithm
实现一些常见基础的算法,并为后续android中使用的复杂算法做准备

### 1.二叉树的遍历

先序思想：中左右

中序思想：左中右

后序思想：左右中

### 2.二叉树的翻转

思想：temp存储临时二叉树,递归每一层都进行左右子树取反

### 3.二叉树的铺平

思想: 

1.先将左子树铺平返回左根节点 右子树铺平返回右根节点 根节点脱离 

1.5 如果左子树为空 将(铺平后的右子树)赋值给(根节点的右子树中)

2.将铺平的左子树赋予根节点的右子树，再创建右子树的temp 并遍历到末尾 在末尾将铺平的右子树插入(根节点右子树中)

3.返回根节点

### 4.（Android) 一对多关系 找寻decorView下的特定id的子view

思想:

1. 获取其子view的数量并遍历子view

2. 若子view中找到就返回 若子view是viewgroup的话 递归调用此方法 找到就返回

### 5.层序遍历 (应用：链接二叉树next节点)

思想

1. 访问根节点 入队 左节点和右节点

2. 将出队节点的 左节点和右节点入队

3. 递归出队直到结束 


### 6.层序遍历的扩展 (n度好友)

某个学说论述到 每个人之间间隔着6个人的关系 一个6层的好友树能建立庞大的社会关系

假设我们有这样关系的数据库 我们可以简单的实现 推荐给用户n度的关系人群 让用户直接联系 

这种复杂的实现出现在LinkedIn,经常给你推荐人给你认识- 。- 

思想:

说到层序遍历 肯定需要队列 还需要借助辅助列表 一个用来记录已经访问的用户  一个用来记录结果用户列表HashTable去重

每出队一个用户 就去遍历他的直接联系用户入队 出队的用户加入已访问的用户列表中 用来去重 （可能互相联系 查看不了层级）

循环次数为层级数-1  ,所有访问的用户进入结果列表返回




