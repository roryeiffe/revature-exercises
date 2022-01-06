import React, {useState} from "react";
import axios from "axios";
import NewsItem from "./NewsItem";

const News = () => {
    const [news, setNews] = useState([]);

    function onClickHandler() {
        console.log("Clicked!");
        axios.get("https://newsapi.org/v2/everything?domains=wsj.com&apiKey=4ca570c2d36c48c09250d47ed80d1f2e")
        .then(response => setNews(response.data.articles))
        .catch(error => console.log(error));
    }

    return (
        <div className = "container">
            <button className = "btn btn-primary" onClick = {onClickHandler}>Show News</button>
            <div className = "row">
            {news.map(article => (
                <NewsItem data = {article}/>
            ))
            }
        </div>
        </div>
    )
    
}

export default News;