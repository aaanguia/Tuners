import React from "react"
import { Link } from "react-router-dom"
import "./Cards.css"

function InstaCard(props) {
  return (
    <>
      <li className="insta_post">
        <Link className="insta_post_link" to={props.path} target="_blank">
          <figure className="insta_post_pic-wrap" data-category={props.label}>
            <img src={props.src} alt="Car" className="insta_post_img" />
          </figure>
          <div className="insta_post_title">
            <h5 className="insta_post_text">{props.text}</h5>
          </div>
        </Link>
      </li>
    </>
  )
}

export default InstaCard
