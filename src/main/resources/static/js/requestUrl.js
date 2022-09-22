const nginxBaseUrl= 'http://127.0.0.1:82';                        //  nginx访问基础地址
const requestUrl = {

  home: 'index',                                          // 首页
  getMerchandiseList : '/merchandise/getMerchandiseList', // 商品列表展示
  getMerchandiseById : '/merchandise/getMerchandiseById', // 根据商品id获取商品详情
  submitOrder: '/merchandise/submitOrder',                // 提交订单
  payMoney: '/merchandise/payMoney',                       // 付款接口
  getOrderById: 'merchandise/getOrderById',                // 根据订单id获取订单详情
  login: '/user/login',                                    //  登入接口
  register: '/user/register',                               // 注册接口
  kafkaLogUrl: nginxBaseUrl+'/log'                          // kafka日志记录地址
}
