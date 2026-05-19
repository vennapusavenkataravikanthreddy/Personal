const data={
    title:"This is callback and promise demo",
    description:"How to work with promise demo"
}
function notifySubscriber(videoData)
{
    console.log("notification sent....."+videoData.title);
}
function uploadVideo()
{
    return new Promise((resolve,reject)=>
    {
       setTimeout(()=>
        {
            const isuploaded=true;
             if(isuploaded)
                resolve("Upload done")
            else
                reject("Upload failed")
        },3000);
    })
}
function publisVideo()
{
    return new Promise((resolve,reject)=>
    {
       setTimeout(()=>
        {
            const ispublished=false;
             if(ispublished)
                resolve("publish done")
            else
                reject("publish failed")
        },1500);
    })
}

//Using async await
async function processVideo() { 
    try {   
        const uploadedStatus = await uploadVideo();
        console.log(uploadedStatus);
        const publishStatus = await publisVideo();
        console.log(publishStatus);
        notifySubscriber(data);
    }
    catch(error) {
        console.log(error);
    }
}
processVideo();

