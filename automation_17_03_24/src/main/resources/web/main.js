// window - is a variable in JS that refers to the browser
// document - is a variable in JS that refers to the current opened page


function imageDisplay(event) {
    let checkbox = event.target; // get the checkbox object
    // console.dir(checkbox); // print the checkbox object
    // console.log(checkbox.checked); // print the state of the checkbox (true / false)
    let divImages = document.getElementById("div-images");
    if(checkbox.checked){
        // show the images
        divImages.style = "";
    }else{
        // hide the images
        divImages.style = "display: none;";
    }
}