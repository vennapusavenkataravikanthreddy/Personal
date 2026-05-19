function uploadVideo(){
    return new Promise((resolve) => {
 console.log("uploading the video");
  setTimeout(()=>
   {
      console.log("Upload Done");
      resolve();        
   }, 3000);
});
}   
function publishVideo(){
    return new Promise((resolve) => {
        console.log("Publishing the video");
        setTimeout(() => {
            console.log("Publish Done");
            resolve();
        }, 2000);
    });
}
function notifySubcriber(){
    console.log("Notifying the subscribers");
}
uploadVideo()
    .then(() => publishVideo())
    .then(() => notifySubcriber())
    .catch((error) => console.log(error));

    async function processVideo() { 
    await uploadVideo
    await publishVideo()
    notifySubcriber()
}
processVideo();
   