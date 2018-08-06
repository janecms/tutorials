var events= require('events');

// 创建 eventEmitter 对象
var eventEmitter=new events.EventEmitter();


var connectHandler= function connected(){
	console.log('connect success');
	eventEmitter.emit('data_received');
}
eventEmitter.on('connection',connectHandler);
eventEmitter.on('data_received',function(){
  console.log('数据接收成功。');
});

// 触发 connection 事件 
eventEmitter.emit('connection');


console.log("程序执行完毕。");