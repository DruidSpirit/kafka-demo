//  工具类
// noinspection JSUnusedGlobalSymbols
// noinspection JSCommentMatchesSignature
/**
 * 对于get请求传数组的情况将list拼接成请求字符串
 * @param urlList   传入的数组参数
 * @returns {string} 拼接后的请求参数字符串
 */
function toolForUrlGetParamTr( paramName, urlList ) {

    var str = '';
    for ( index in urlList ) {
        // noinspection JSUnfilteredForInLoop
        str +=  paramName + '=' + urlList[index] + '&';
    }
    str.substr(0,str.length-2);

    return str;
}

/**
 * 日志收集到kafka
 * @param logData   被收集的数据
 */
function logCollect( logData ){

    axios

        .post(requestUrl.kafkaLogUrl,JSON.stringify(logData))
        .then(function (rep) {
            console.log(rep)
        })
        .catch(function (error) { // 请求失败处理
            console.log(error);
        });
}