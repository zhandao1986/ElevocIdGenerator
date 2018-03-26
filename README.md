![https://github.com/imu-hupeng/ElevocIdGenerator/releases/download/v0.0.1/ElevocIdGenerator.jar](https://img.shields.io/badge/downloads%400.0.1-3.23k-brightgreen.svg)
![](https://img.shields.io/hexpm/l/plug.svg)
![](https://img.shields.io/badge/version-0.0.1-yellow.svg)
# 生成不重复纯数字订单号（理论上 重复的概率很低）
## 16位以上ID号里面前几位是当前的时间字段
## 非时间字段的ID算法使用的是tweeter的snowflake：
> snowflake算法说明:<br>
>   (a) id构成: 42位的时间前缀 + 10位的节点标识 + 12位的sequence避免并发的数字(12位不够用时强制得到新的时间前缀)<br>
>       注意这里进行了小改动: snowkflake是5位的datacenter加5位的机器id; 这里变成使用10位的机器id<br>
>   (b) 对系统时间的依赖性非常强，需关闭ntp的时间同步功能。当检测到ntp时间调整后，将会拒绝分配id<br>

*注:此sdk在snowflake算法调用失败的时候，会使用Java自带的随机数算法来代替，以保证业务系统的连续性。
### 此ID生成器工具类用于公司后台项目生成微信支付ID（要求不重复，理论上32位就足够，且ID的前几位为时间字段，方便从ID号直接可以看出某个ID的生成时间），也可广泛用于电子商务等系统的订单号生成。

<br>

# 一：方法说明
## 1.uuid8
### 生成8位订单号（不推荐）
### Id组成：纯8位随机数字
### 样例调用：
```java
public static void main(String[] args) {
    String id = ElevocIdGenerator.uuid8();
}
```
### 样例输出：
> 49568404

## 2.uuid16
### 生成16位订单号
### Id组成：yyMMdd + (10位随机数字)
### 样例调用：
```java
public static void main(String[] args) {
    String id = ElevocIdGenerator.uuid16();
}
```
### 样例输出：
> 1803264956849853

## 3.uuid32
### 生成32位订单号
### Id组成：yyyyMMddHHmmss + (18位随机数字)
### 样例调用：
```java
public static void main(String[] args) {
    String id = ElevocIdGenerator.uuid32();
}
```
### 样例输出：
> 20180326113234495685615493320704

## 4.uuid64
### 生成64位订单号
### Id组成：yyyyMMddHHmmssSSS + (47位随机数字)
### 样例调用：
```java
public static void main(String[] args) {
    String id = ElevocIdGenerator.uuid64();
}
```
### 样例输出：
> 2018032611342298134985027466447814478109523598834209932408631434

# 二：JAR下载
[ElevocIdGenerator.jar](https://github.com/imu-hupeng/ElevocIdGenerator/releases/download/v0.0.1/ElevocIdGenerator.jar)

# 三：授权协议
本项目遵循Apache协议,完全开源,文档齐全,永远免费(商用也是)