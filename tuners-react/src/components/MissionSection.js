import React from "react"
import "../App.css"
import { Button } from "./Button"
import "./MissionSection.css"

export default function MissionSection() {
  return (
    <div className="mission-container">
      <video src="/videos/MissionVid.mp4" autoPlay loop muted />
      <h1>Tun3rs Isn't a Brand, It is Us</h1>
      <p>Become Different, Become a Tun3r</p>
      <div className="hero-btns">
        <Button
          className="btns"
          buttonStyle="btn--outline"
          buttonSize="btn--large"
          to="/catalog"
        >
          GET STARTED
        </Button>
        <Button
          className="btns"
          buttonStyle="btn--primary"
          buttonSize="btn--large"
        >
          Watch Trailer <i className="far fa-play-circle" />{" "}
        </Button>
      </div>
    </div>
  )
}
