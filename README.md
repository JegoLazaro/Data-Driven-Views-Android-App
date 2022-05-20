# Data-Driven-Views-Android-App

The single activity / screen a list of posts styled somewhat like how Instagram is presented.
In a post, you have the following information
User’s username
User’s image
Location
Image of the post
A like button
Caption of the post
Date posted
Files are provided and you’re expected to use these files. A zip file of all the files needed and a quick description is provided below this table.
The list must be implemented using a RecyclerView.
In case it isn’t obvious from the video, here are some notes with how the ViewHolder adjusts based on the content of the data:
When there is content, the view is displayed under the username on top of the image.
When it is null, the view responsible for displaying the location is not seen and does not take up space -- centering the username with the user’s image.
When the caption is present, it is displayed to the right of the user’s name under the like button.
When it is null, both the username and caption are not seen and do not take up space. This does not affect the like button nor the date posted.
Some posts are automatically liked on initialization while others are not.
Whatever changes are many within the life of the app are not saved on close.
All posts have a location, but the value can be null. 
All posts have a caption, but like the location, the caption can be null.
The Like button can be clicked by the user to like or unlike a post.
Lastly, kindly observe proper spacing between Views, as well as text size. Specifics aren’t provided, so try to style your views accordingly.
