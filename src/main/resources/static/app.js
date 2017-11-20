// var footer = document.querySelector('footer');
// footer.addEventListener('mouseover', function(){
// 	footer.style.backgroundColor='purple';
// });

var paragraph = document.querySelector('p');
paragraph.addEventListener('mouseover', function(){
	paragraph.style.fontSize='2rem';
});

paragraph.addEventListener('mouseout', function(){
	paragraph.style.fontSize='1.5rem';
});

var copyright = document.querySelector('small');
copyright.addEventListener('mouseover', function(){
	copyright.innerHTML = "created by Leslie Geissler";
});

document.querySelector(".remove").addEventListener("submit", function(e){
    if(confirm('Are you sure you want to remove this tag?')){
    	// the thing is allowed to do
    } else {
        e.preventDefault();    //stop form from submitting
        // the thing does not get to do :(
    }
});

document.querySelector("#new-comment").addEventListener("submit", function(e){
    if(confirm('Do you really want to say that???')){
        e.preventDefault(); 
    	document.querySelector("#comments").innerHTML = document.querySelector('#comment').value;
    	// the thing is allowed to do
    } else {
        e.preventDefault();    //stop form from submitting
        // the thing does not get to do :(
    }
});

// document.getElementById('testify').style.width="300px";
// document.getElementById('testify').style.fontSize="14pt";


// var userComment = document.myForm.MyContent.value;
// userComment.addEventListener('click')

// document.getElementsByTagName('h3')[0].onclick = function() {
//     this.style.backgroundColor = `orange`;
// }

// var removeButton = document.getElementById('removeButton');
// removeButton.onclick = function() {
//     var userResponse = confirm('Are you sure you want to remove this tag?');
//     var displayContainer = document.getElementById('confirmResponse');
//     var displayMessage = '';
//     if (userResponse) {
//         displayMessage += 'That tag is hutched!'
//     } else {
//         displayMessage += 'Wise choice.  Every tag is sacred.'
//     }
//     displayContainer.innerText = displayMessage;
// }

// function addContent(divName, content) {
// 	     document.getElementById(divName).innerHTML = content;
// };

// function checkRemove() {
//     var x = document.forms.remove.tag.value;
//     if (x !== "") {
//         alert("Are you sure you want to remove this tag?");
//         return true;
//     }
// }

// var comment = prompt("Please enter your own review comment", "<comment here>");

// if (comment!= null) {

//     document.getElementById("").innerHTML = comment;

// }