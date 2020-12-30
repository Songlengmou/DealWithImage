package com.anningtex.dealwithimage.test.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Song
 */
public class TestBean implements Serializable {

    /**
     * code : 1
     * msg : Success
     * data : {"designerlist":[{"id":18,"username":"LTT","create_time":"2019-08-08 10:38:49","ip":"167772674","status":1,"update_time":"2019-10-16 17:07:37","nickname":"卢甜甜"},{"id":19,"username":"ZNN","create_time":"2019-08-08 10:44:51","ip":"167772674","status":1,"update_time":"2019-11-08 16:13:58","nickname":"张楠楠"},{"id":21,"username":"WYL","create_time":"2019-09-12 16:40:04","ip":"192.168.0.143","status":1,"update_time":"2020-10-13 10:20:42","nickname":"WYL"},{"id":22,"username":"CHENGW","create_time":"2019-08-08 10:47:13","ip":"127.0.0.1","status":1,"update_time":"2020-11-03 14:55:13","nickname":"程皖"},{"id":29,"username":"DEMO1","create_time":"2019-10-14 14:35:36","ip":"10.0.2.2","status":1,"update_time":"2020-12-29 09:12:48","nickname":"测试账号"}],"imglist":[{"id":59685,"show_name":"YT2012003C","original":"/uploads/20201225/003fa01db4c1d680c6d2014995df555f.jpg","medium":"/medium/20201225/003fa01db4c1d680c6d2014995df555f.jpg","mini":"/mini/20201225/003fa01db4c1d680c6d2014995df555f.jpg","update_time":"2020-12-25 09:54:07","create_time":"2020-12-25 09:54:07","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AA"],"flower_order_no":"","commentCount":0},{"id":59684,"show_name":"YB2012002C","original":"/uploads/20201222/fb95cfeb524371c24b467b75a2667614.jpg","medium":"/medium/20201222/fb95cfeb524371c24b467b75a2667614.jpg","mini":"/mini/20201222/fb95cfeb524371c24b467b75a2667614.jpg","update_time":"2020-12-22 09:11:08","create_time":"2020-12-22 09:11:08","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AAA","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59683,"show_name":"YT2012002C","original":"/uploads/20201222/4e2b501dd4e587190e3347802e0984e2.jpg","medium":"/medium/20201222/4e2b501dd4e587190e3347802e0984e2.jpg","mini":"/mini/20201222/4e2b501dd4e587190e3347802e0984e2.jpg","update_time":"2020-12-22 09:07:00","create_time":"2020-12-22 09:07:00","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AF"],"flower_order_no":"","commentCount":0},{"id":59682,"show_name":"YB2012001C","original":"/uploads/20201222/865947442e403f0e10a53bee342b757e.jpg","medium":"/medium/20201222/865947442e403f0e10a53bee342b757e.jpg","mini":"/mini/20201222/865947442e403f0e10a53bee342b757e.jpg","update_time":"2020-12-22 09:06:29","create_time":"2020-12-22 09:06:29","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AF","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59681,"show_name":"YT2012001C","original":"/uploads/20201218/a2aca372100aea06e5d51710bd08f038.jpg","medium":"/medium/20201218/a2aca372100aea06e5d51710bd08f038.jpg","mini":"/mini/20201218/a2aca372100aea06e5d51710bd08f038.jpg","update_time":"2020-12-18 13:50:34","create_time":"2020-12-18 13:50:34","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AF"],"flower_order_no":"","commentCount":0},{"id":59680,"show_name":"111","original":"/uploads/20201208/1f0442fb49ed1876586c04f764ee80a2.bmp","medium":"/medium/20201208/1f0442fb49ed1876586c04f764ee80a2.bmp","mini":"/mini/20201208/1f0442fb49ed1876586c04f764ee80a2.bmp","update_time":"2020-12-08 16:27:55","create_time":"2020-12-08 16:27:55","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["IB"],"flower_order_no":"","commentCount":0},{"id":59679,"show_name":"11","original":"/uploads/20201208/8d22071f96fbc17ea2004048451c6c7b.bmp","medium":"/medium/20201208/8d22071f96fbc17ea2004048451c6c7b.bmp","mini":"/mini/20201208/8d22071f96fbc17ea2004048451c6c7b.bmp","update_time":"2020-12-08 16:27:38","create_time":"2020-12-08 16:27:38","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["IB"],"flower_order_no":"SU120719AKT SU140126KAT WX130407KAT","commentCount":0},{"id":59678,"show_name":"3","original":"/uploads/20201208/4679bfb02acdbad8ba2e5cf3892de1ab.jpg","medium":"/medium/20201208/4679bfb02acdbad8ba2e5cf3892de1ab.jpg","mini":"/mini/20201208/4679bfb02acdbad8ba2e5cf3892de1ab.jpg","update_time":"2020-12-08 16:27:22","create_time":"2020-12-08 16:27:22","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["IB"],"flower_order_no":"SU120719AKT SU140126KAT WX130407KAT","commentCount":0},{"id":59677,"show_name":"2","original":"/uploads/20201208/d0227d4e70d89b7a25913c8d0d3e4207.jpg","medium":"/medium/20201208/d0227d4e70d89b7a25913c8d0d3e4207.jpg","mini":"/mini/20201208/d0227d4e70d89b7a25913c8d0d3e4207.jpg","update_time":"2020-12-08 16:27:22","create_time":"2020-12-08 16:27:22","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["IB"],"flower_order_no":"SU140126KAT WX130407KAT SU120719AKT","commentCount":0},{"id":59676,"show_name":"1","original":"/uploads/20201208/7812fe74e19797d3154bc804c18722c2.jpg","medium":"/medium/20201208/7812fe74e19797d3154bc804c18722c2.jpg","mini":"/mini/20201208/7812fe74e19797d3154bc804c18722c2.jpg","update_time":"2020-12-08 16:27:21","create_time":"2020-12-08 16:27:21","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["IB"],"flower_order_no":"SU120719AKT SU140126KAT WX130407KAT","commentCount":0},{"id":59675,"show_name":"YT2011545Z","original":"/uploads/20201126/05347b9afa96c0cae37cc622059a0685.jpeg","medium":"/medium/20201126/05347b9afa96c0cae37cc622059a0685.jpeg","mini":"/mini/20201126/05347b9afa96c0cae37cc622059a0685.jpeg","update_time":"2020-11-26 11:08:35","create_time":"2020-11-26 11:08:35","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["AF"],"flower_order_no":"","commentCount":0},{"id":59674,"show_name":"YT2011003A","original":"/uploads/20201106/3ff1e1e30637cf82f576c97d070b15f2.jpg","medium":"/medium/20201106/3ff1e1e30637cf82f576c97d070b15f2.jpg","mini":"/mini/20201106/3ff1e1e30637cf82f576c97d070b15f2.jpg","update_time":"2020-11-06 16:42:31","create_time":"2020-11-06 16:42:31","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["AA"],"flower_order_no":"","commentCount":0},{"id":59673,"show_name":"YT2011002A","original":"/uploads/20201106/040d56d1e0c529a6d38352de0ca517e1.jpg","medium":"/medium/20201106/040d56d1e0c529a6d38352de0ca517e1.jpg","mini":"/mini/20201106/040d56d1e0c529a6d38352de0ca517e1.jpg","update_time":"2020-11-06 16:42:30","create_time":"2020-11-06 16:42:30","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["AA"],"flower_order_no":"","commentCount":0},{"id":59672,"show_name":"YT2011001A","original":"/uploads/20201106/793cc4c1c6427e52fd6c05f58c1782a7.jpg","medium":"/medium/20201106/793cc4c1c6427e52fd6c05f58c1782a7.jpg","mini":"/mini/20201106/793cc4c1c6427e52fd6c05f58c1782a7.jpg","update_time":"2020-11-06 16:42:30","create_time":"2020-11-06 16:42:29","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["AA"],"flower_order_no":"","commentCount":0},{"id":59670,"show_name":"YT2010001A","original":"/uploads/20201027/29eba6a889977251927b4b5f8f5880c3.jpg","medium":"/medium/20201027/29eba6a889977251927b4b5f8f5880c3.jpg","mini":"/mini/20201027/29eba6a889977251927b4b5f8f5880c3.jpg","update_time":"2020-10-27 11:42:04","create_time":"2020-10-27 11:42:04","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["AA"],"flower_order_no":"","commentCount":0},{"id":59669,"show_name":"YB2008015C","original":"/uploads/20200821/d781b5e6077ef52e552216cdf4402fe6.bmp","medium":"/medium/20200821/d781b5e6077ef52e552216cdf4402fe6.bmp","mini":"/mini/20200821/d781b5e6077ef52e552216cdf4402fe6.bmp","update_time":"2020-08-21 08:39:42","create_time":"2020-08-21 08:39:42","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59668,"show_name":"YB2008014C","original":"/uploads/20200821/fd2bfcbe30562461feb3f6ffcc8b9523.jpg","medium":"/medium/20200821/fd2bfcbe30562461feb3f6ffcc8b9523.jpg","mini":"/mini/20200821/fd2bfcbe30562461feb3f6ffcc8b9523.jpg","update_time":"2020-08-21 08:32:56","create_time":"2020-08-21 08:32:56","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":2},{"id":59667,"show_name":"YT20080025C","original":"/uploads/20200820/cf8b58554b179637815a8c3b606ef141.jpg","medium":"/medium/20200820/cf8b58554b179637815a8c3b606ef141.jpg","mini":"/mini/20200820/cf8b58554b179637815a8c3b606ef141.jpg","update_time":"2020-08-20 17:36:20","create_time":"2020-08-20 17:36:20","create_user":"WYL","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX"],"flower_order_no":"","commentCount":0},{"id":59666,"show_name":"YT20080024C","original":"/uploads/20200820/ba0531a6b97a3642703b0fd083e87645.jpg","medium":"/medium/20200820/ba0531a6b97a3642703b0fd083e87645.jpg","mini":"/mini/20200820/ba0531a6b97a3642703b0fd083e87645.jpg","update_time":"2020-08-20 17:35:56","create_time":"2020-08-20 17:35:56","create_user":"WYL","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX"],"flower_order_no":"","commentCount":0},{"id":59665,"show_name":"YT20080023R","original":"/uploads/20200820/6c26e217b1943fe49cf26971eafb3b80.jpg","medium":"/medium/20200820/6c26e217b1943fe49cf26971eafb3b80.jpg","mini":"/mini/20200820/6c26e217b1943fe49cf26971eafb3b80.jpg","update_time":"2020-08-20 17:30:03","create_time":"2020-08-20 17:30:03","create_user":"WYL","country_id":7,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":7,"name":"卢旺达"},"attention":false,"img_spec":["AFX"],"flower_order_no":"","commentCount":0},{"id":59664,"show_name":"YT20080022R","original":"/uploads/20200820/f671f7935d9ab6f7ea47aa8166dc446b.jpg","medium":"/medium/20200820/f671f7935d9ab6f7ea47aa8166dc446b.jpg","mini":"/mini/20200820/f671f7935d9ab6f7ea47aa8166dc446b.jpg","update_time":"2020-08-20 17:30:00","create_time":"2020-08-20 17:30:00","create_user":"WYL","country_id":7,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":7,"name":"卢旺达"},"attention":false,"img_spec":["AFX"],"flower_order_no":"","commentCount":0},{"id":59663,"show_name":"YB2008013","original":"/uploads/20200820/8924da6843a062f910f7547021628404.jpg","medium":"/medium/20200820/8924da6843a062f910f7547021628404.jpg","mini":"/mini/20200820/8924da6843a062f910f7547021628404.jpg","update_time":"2020-08-20 17:26:47","create_time":"2020-08-20 17:26:47","create_user":"WYL","country_id":4,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":4,"name":"国内"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59662,"show_name":"YB2008012A","original":"/uploads/20200820/2e31c9f3a94f5814ae365b1b8c4d3e86.jpg","medium":"/medium/20200820/2e31c9f3a94f5814ae365b1b8c4d3e86.jpg","mini":"/mini/20200820/2e31c9f3a94f5814ae365b1b8c4d3e86.jpg","update_time":"2020-08-20 17:24:55","create_time":"2020-08-20 17:24:55","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["AF","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59661,"show_name":"YB2008011C","original":"/uploads/20200820/52d4eddf6a5e411e442847792a04e555.jpg","medium":"/medium/20200820/52d4eddf6a5e411e442847792a04e555.jpg","mini":"/mini/20200820/52d4eddf6a5e411e442847792a04e555.jpg","update_time":"2020-08-20 17:15:46","create_time":"2020-08-20 17:15:46","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59660,"show_name":"YB2008010C","original":"/uploads/20200820/8834e3b3eb6d9f94573d6dcc342274b7.jpg","medium":"/medium/20200820/8834e3b3eb6d9f94573d6dcc342274b7.jpg","mini":"/mini/20200820/8834e3b3eb6d9f94573d6dcc342274b7.jpg","update_time":"2020-08-20 17:15:46","create_time":"2020-08-20 17:15:46","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59659,"show_name":"YB2008009C","original":"/uploads/20200820/c934964995743271506cb17f8e99645d.jpg","medium":"/medium/20200820/c934964995743271506cb17f8e99645d.jpg","mini":"/mini/20200820/c934964995743271506cb17f8e99645d.jpg","update_time":"2020-08-20 17:15:42","create_time":"2020-08-20 17:15:42","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59658,"show_name":"YB2008008C","original":"/uploads/20200820/467584a6f85acb6dce8c28f37e42f384.jpg","medium":"/medium/20200820/467584a6f85acb6dce8c28f37e42f384.jpg","mini":"/mini/20200820/467584a6f85acb6dce8c28f37e42f384.jpg","update_time":"2020-08-20 17:15:39","create_time":"2020-08-20 17:15:39","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59657,"show_name":"YB2008007C","original":"/uploads/20200820/5dc3bc784304023834297413b934fb32.jpg","medium":"/medium/20200820/5dc3bc784304023834297413b934fb32.jpg","mini":"/mini/20200820/5dc3bc784304023834297413b934fb32.jpg","update_time":"2020-08-20 17:15:36","create_time":"2020-08-20 17:15:36","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59656,"show_name":"YB2008006C","original":"/uploads/20200820/2edf631d243abad5ae444aca0af4322f.jpg","medium":"/medium/20200820/2edf631d243abad5ae444aca0af4322f.jpg","mini":"/mini/20200820/2edf631d243abad5ae444aca0af4322f.jpg","update_time":"2020-08-20 17:15:33","create_time":"2020-08-20 17:15:33","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59655,"show_name":"YT20080021C","original":"/uploads/20200820/a536a01eec745d1745024aaced5907c2.bmp","medium":"/medium/20200820/a536a01eec745d1745024aaced5907c2.bmp","mini":"/mini/20200820/a536a01eec745d1745024aaced5907c2.bmp","update_time":"2020-08-20 17:12:11","create_time":"2020-08-20 17:12:11","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX"],"flower_order_no":"","commentCount":0},{"id":59654,"show_name":"YB2008005Z","original":"/uploads/20200820/0541f72e1b388dab6ce34e621a41f56c.bmp","medium":"/medium/20200820/0541f72e1b388dab6ce34e621a41f56c.bmp","mini":"/mini/20200820/0541f72e1b388dab6ce34e621a41f56c.bmp","update_time":"2020-08-20 17:11:34","create_time":"2020-08-20 17:11:34","create_user":"测试账号","country_id":9,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":9,"name":"赞比亚"},"attention":false,"img_spec":["AN","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59653,"show_name":"YT20080020C","original":"/uploads/20200820/32a9cec245fd01cc7f3270e217160039.bmp","medium":"/medium/20200820/32a9cec245fd01cc7f3270e217160039.bmp","mini":"/mini/20200820/32a9cec245fd01cc7f3270e217160039.bmp","update_time":"2020-08-20 17:10:28","create_time":"2020-08-20 17:10:28","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AFX"],"flower_order_no":"","commentCount":0},{"id":59652,"show_name":"YB2008004A","original":"/uploads/20200820/5459376a4a7086f1646bd69c640e81bc.jpg","medium":"/medium/20200820/5459376a4a7086f1646bd69c640e81bc.jpg","mini":"/mini/20200820/5459376a4a7086f1646bd69c640e81bc.jpg","update_time":"2020-08-20 17:09:16","create_time":"2020-08-20 17:09:16","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59651,"show_name":"YT20080019C","original":"/uploads/20200820/3f748087bf51b7ca77c080228ad46ceb.jpg","medium":"/medium/20200820/3f748087bf51b7ca77c080228ad46ceb.jpg","mini":"/mini/20200820/3f748087bf51b7ca77c080228ad46ceb.jpg","update_time":"2020-08-20 17:06:56","create_time":"2020-08-20 17:06:56","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AF"],"flower_order_no":"","commentCount":0},{"id":59650,"show_name":"YB2008003R","original":"/uploads/20200820/6ccfdcb044bbdc4dc0c944a90517ac21.jpg","medium":"/medium/20200820/6ccfdcb044bbdc4dc0c944a90517ac21.jpg","mini":"/mini/20200820/6ccfdcb044bbdc4dc0c944a90517ac21.jpg","update_time":"2020-08-20 17:06:31","create_time":"2020-08-20 17:06:31","create_user":"测试账号","country_id":7,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":7,"name":"卢旺达"},"attention":false,"img_spec":["AFX","国外寄样"],"flower_order_no":"","commentCount":0},{"id":59649,"show_name":"YT20080018C","original":"/uploads/20200820/81303728de7ba51b27261e0f5e16699b.jpg","medium":"/medium/20200820/81303728de7ba51b27261e0f5e16699b.jpg","mini":"/mini/20200820/81303728de7ba51b27261e0f5e16699b.jpg","update_time":"2020-08-20 17:03:08","create_time":"2020-08-20 17:03:08","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AF"],"flower_order_no":"","commentCount":0},{"id":59648,"show_name":"YT20080017C","original":"/uploads/20200820/ac3947645c60f018d186c1757b7d29a0.bmp","medium":"/medium/20200820/ac3947645c60f018d186c1757b7d29a0.bmp","mini":"/mini/20200820/ac3947645c60f018d186c1757b7d29a0.bmp","update_time":"2020-08-20 17:00:20","create_time":"2020-08-20 17:00:20","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AF"],"flower_order_no":"","commentCount":0},{"id":59647,"show_name":"YB2008002A","original":"/uploads/20200820/e9f206f203cc85300db4441094d2163c.bmp","medium":"/medium/20200820/e9f206f203cc85300db4441094d2163c.bmp","mini":"/mini/20200820/e9f206f203cc85300db4441094d2163c.bmp","update_time":"2020-08-20 16:49:12","create_time":"2020-08-20 16:49:12","create_user":"测试账号","country_id":2,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":2,"name":"乌干达"},"attention":false,"img_spec":["国外寄样"],"flower_order_no":"","commentCount":0},{"id":59646,"show_name":"YT20080016C","original":"/uploads/20200820/3176d126efaffc1a6b9d2f2cf9c59780.jpg","medium":"/medium/20200820/3176d126efaffc1a6b9d2f2cf9c59780.jpg","mini":"/mini/20200820/3176d126efaffc1a6b9d2f2cf9c59780.jpg","update_time":"2020-08-20 16:48:15","create_time":"2020-08-20 16:48:15","create_user":"测试账号","country_id":6,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":6,"name":"刚果"},"attention":false,"img_spec":["AF"],"flower_order_no":"","commentCount":0},{"id":59645,"show_name":"YT20080015R","original":"/uploads/20200820/9d6e81b6a69396fa85ba1b8358a8f121.jpg","medium":"/medium/20200820/9d6e81b6a69396fa85ba1b8358a8f121.jpg","mini":"/mini/20200820/9d6e81b6a69396fa85ba1b8358a8f121.jpg","update_time":"2020-08-20 16:47:18","create_time":"2020-08-20 16:47:18","create_user":"测试账号","country_id":7,"img_category":{"id":1,"name":"花型图"},"img_country":{"id":7,"name":"卢旺达"},"attention":false,"img_spec":["AFX"],"flower_order_no":"","commentCount":0}],"speclist":[{"id":55,"name":"AA","create_time":"2020-10-27 11:41:43","status":1,"user_id":29},{"id":3,"name":"AAA","create_time":"2019-08-12 18:09:08","status":1,"user_id":1},{"id":32,"name":"AF","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":9,"name":"AFX","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":33,"name":"AFX","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":10,"name":"AN","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":34,"name":"AN","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":11,"name":"AS","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":7,"name":"CK","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":31,"name":"CK","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":36,"name":"DJ","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":21,"name":"DJY","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":13,"name":"FO","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":37,"name":"FO","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":38,"name":"IB","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":22,"name":"JF","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":15,"name":"MF","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":39,"name":"MF","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":28,"name":"OR","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":52,"name":"OR","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":23,"name":"PA","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":47,"name":"PA","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":6,"name":"PJ","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":24,"name":"PJX","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":48,"name":"PJX","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":49,"name":"PJY","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":26,"name":"PO","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":27,"name":"PS","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":17,"name":"SF","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":41,"name":"SF","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":5,"name":"SJ","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":43,"name":"SS","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":20,"name":"SU","create_time":"2019-09-11 09:51:23","status":1,"user_id":1},{"id":54,"name":"国外寄样","create_time":"2020-02-25 17:37:24","status":1,"user_id":1},{"id":53,"name":"花型好","create_time":"2019-09-28 11:19:10","status":1,"user_id":1},{"id":2,"name":"花纹","create_time":"2019-08-09 10:29:09","status":1,"user_id":2},{"id":1,"name":"非洲","create_time":"2019-08-09 10:28:54","status":1,"user_id":2}],"total_page":1467}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        private int total_page;
        private List<DesignerlistBean> designerlist;
        private List<ImglistBean> imglist;
        private List<SpeclistBean> speclist;

        public int getTotal_page() {
            return total_page;
        }

        public void setTotal_page(int total_page) {
            this.total_page = total_page;
        }

        public List<DesignerlistBean> getDesignerlist() {
            return designerlist;
        }

        public void setDesignerlist(List<DesignerlistBean> designerlist) {
            this.designerlist = designerlist;
        }

        public List<ImglistBean> getImglist() {
            return imglist;
        }

        public void setImglist(List<ImglistBean> imglist) {
            this.imglist = imglist;
        }

        public List<SpeclistBean> getSpeclist() {
            return speclist;
        }

        public void setSpeclist(List<SpeclistBean> speclist) {
            this.speclist = speclist;
        }

        public static class DesignerlistBean implements Serializable {
            private int id;
            private String username;
            private String create_time;
            private String ip;
            private int status;
            private String update_time;
            private String nickname;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getIp() {
                return ip;
            }

            public void setIp(String ip) {
                this.ip = ip;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }
        }

        public static class ImglistBean implements Serializable {
            private int id;
            private String show_name;
            private String original;
            private String medium;
            private String mini;
            private String update_time;
            private String create_time;
            private String create_user;
            private int country_id;
            private ImgCategoryBean img_category;
            private ImgCountryBean img_country;
            private boolean attention;
            private String flower_order_no;
            private int commentCount;
            private List<String> img_spec;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getShow_name() {
                return show_name;
            }

            public void setShow_name(String show_name) {
                this.show_name = show_name;
            }

            public String getOriginal() {
                return original;
            }

            public void setOriginal(String original) {
                this.original = original;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getMini() {
                return mini;
            }

            public void setMini(String mini) {
                this.mini = mini;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getCreate_user() {
                return create_user;
            }

            public void setCreate_user(String create_user) {
                this.create_user = create_user;
            }

            public int getCountry_id() {
                return country_id;
            }

            public void setCountry_id(int country_id) {
                this.country_id = country_id;
            }

            public ImgCategoryBean getImg_category() {
                return img_category;
            }

            public void setImg_category(ImgCategoryBean img_category) {
                this.img_category = img_category;
            }

            public ImgCountryBean getImg_country() {
                return img_country;
            }

            public void setImg_country(ImgCountryBean img_country) {
                this.img_country = img_country;
            }

            public boolean isAttention() {
                return attention;
            }

            public void setAttention(boolean attention) {
                this.attention = attention;
            }

            public String getFlower_order_no() {
                return flower_order_no;
            }

            public void setFlower_order_no(String flower_order_no) {
                this.flower_order_no = flower_order_no;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public List<String> getImg_spec() {
                return img_spec;
            }

            public void setImg_spec(List<String> img_spec) {
                this.img_spec = img_spec;
            }

            public static class ImgCategoryBean implements Serializable {
                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ImgCountryBean implements Serializable {
                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class SpeclistBean implements Serializable {
            private int id;
            private String name;
            private String create_time;
            private int status;
            private int user_id;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }
        }
    }
}
