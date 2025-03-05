<template><!--这里是html-->
  <div>
    <div>Bot昵称：{{bot_name}}</div><!--现在通过后端，调用函数，即可在前端展示内容-->
    <div>Bot战力：{{bot_rating}}</div><!--调用变量时，用两个大括号-->
  </div>
  <router-view/>
</template>




<script>//这里是JS
import $ from 'jquery';
import { ref } from 'vue';//为了能够定义变量
//导入这两行的目的：前后端通信

//vue中script的写法固定，先写框架；
//有一个对象叫app，他有一个属性setup，setup是函数入口
  export default{
    name: "App",
    setup: () =>{
      let bot_name=ref("");
      let bot_rating=ref("");

      $.ajax({
        url: "http://localhost:3000/pk/getBotInfo/",
        type:"get",//type只有两种。get是获取；post是创建出去
        success: resp =>{//当获取成功之后，进行括号里的操作
          bot_name.value=resp.name;
          bot_rating.value=resp.rating;
        }
      });

      return {
        bot_name,
        bot_rating
      }
    }
  }
</script>



<style>
/*
  这里是CSS
*/

/*background-image保留字*/ 
/*@代表从根到src的路径*/ 
body{
  background-image:url("@/assets/background.jpg");
  background-size: cover;
}
div{
  color:white;
}
</style>
