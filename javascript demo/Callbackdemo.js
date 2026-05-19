function uploadVideo(callback){
 console.log("uploading the video");
  setTimeout(()=>
   {
      console.log("Upload Done");
      callback();
   }, 3000);
}
function publishVideo(callback){
 console.log("Publishing the video");
 setTimeout(()=>
   {
      console.log("Publish Done");
      callback();
   }, 2000);
}
function notifySubcriber(){
    console.log("Notifying the subscribers");
}
uploadVideo(function(){
   publishVideo(function(){
       notifySubcriber();
   })
})