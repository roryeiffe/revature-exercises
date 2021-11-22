import React, { useState } from "react";
import axios from "axios";
import Post from './Post';

const Posts = () => {
  const [posts, setPosts] = useState([]);

  function onClickHandler() {
    axios
      .get("https://jsonplaceholder.typicode.com/posts")
      .then((response) => {
        setPosts(response.data);
      })
      .catch((error) => console.error(error));
      document.getElementById("showPosts").style.display = "none";
      document.getElementById("hidePosts").style.display = "block";
  }

  function hide() {
      setPosts([]);
      document.getElementById("hidePosts").style.display = "none";
      document.getElementById("showPosts").style.display = "block";

  }

  return (
    <div>
      <h1>Posts:</h1>
      <button id = "showPosts" className = "btn btn-primary" onClick={onClickHandler}>Get Data</button>
      <button id = "hidePosts" className = "btn btn-danger" onClick={hide} style = {{display:"none"}}>Hide Data</button>
      <table className="table table-bordered">
        <thead className="thead-dark">
          <tr>
            <td>Title</td>
            <td>Body</td>
          </tr>
        </thead>
        <tbody>
            {
                posts.map(post => (
                    <Post data = {post}/>
                ))
            }
        </tbody>
      </table>
    </div>
  );
};

export default Posts;
