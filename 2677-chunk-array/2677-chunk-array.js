/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    ch = [];
    for(var i =0;i<arr.length;i+=size){
        ch.push(arr.slice(i,i+size))
    }
    return ch;   
};
