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
