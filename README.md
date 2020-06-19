# software-engineering

代码使用说明
===
lzj分支为林子健创建的代码分支，分工为(待林子健填写)<br>
zhd分支为张浩东创建的代码分支，分工为顾客入住手续办理模块和顾客信息管理模块的编写<br>
zbc分支为赵宝诚创建的代码分支，分工为(待赵宝诚填写)<br>

I.系统配置说明
---
  * 使用`NetBeans IDE 8.2`打开项目文件<br>
  * 本地须存在一个hotelsystem `MySql数据库`,另外需将db包内的dbhelper内的数据库连接url根据本地MySql数据库的配置情况修改用户名,密码，端口号。<br>
  * db包包含所有的`数据库操作`，entity包包含所有的`实体类型`，gui包包含所有的`窗体`。`系统主界面运行从gui包内的Main.java开始。`<br>
  
II.代码运行说明
---
  * 房间预订阶段:点击主界面内的房间查询按钮，此时显示`机选`和`自选`两个按钮。若点击`机选`，进入`系统查询房间页面`，在此处输入`姓名`，`电话号码`，`入住时间`，并选择`要入住的房间类型`后点击`查询`，最后点击`预定房间`，则`房间预定阶段`完成。若点击`自选`，进入页面，在此处输入`姓名`，`电话号码`，`入住时间`，`房间房号`，点击`查询`，最后点击`预订房间`，则`房间预订阶段`完成。<br>
  * 顾客入住手续办理阶段:首先需输入`顾客电话号码`进行`查询`，确认该顾客已预订房间。随后输入顾客的详细信息，最后点击`确定`，则`顾客入住手续办理阶段`完成。<br>
  * 管理员系统:
    * 登录:通过编号和密码进行登录。初始编号为1，初始密码为123456。<br>
    * 顾客信息管理:可查询所有顾客信息，根据电话号码查询特定顾客信息，删除顾客信息，修改顾客信息。<br>
